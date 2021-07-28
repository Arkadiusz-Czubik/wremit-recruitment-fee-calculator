## Fee calculator
Your company provides a solution to transfer money between countries. The application is working great - it is fast, it is convenient and looks wonderful. You have many clients and all of them are happy because of using it.

It's time to earn some money!

Currently all transfers are free of charge - only transfer amount is being withdrawn from client's bank account. You received the request to create a component that will count a fee based on the transfer data.

For sure the component cannot always return fixed value - there are significant differences in how transfers are being delievered depends on source/target country, local tax regulations etc. 

The transfer payload is defined and looks like this:
```
{
    "sourceCountry": "NAME_OF_SOURCE_COUNTRY",
    "targetCountry": "NAME_OF_TARGET_COUNTRY",
    "transferAmount": "INTEGER_VALUE_OF_TRANSFER_AMOUNT",
    "comment": "COMMENT_FOF_A_TRANSFER"
}
```

You need to design a solution to which you can always add some new rules based on the transfer properties. 

For a beginning the Business Department gave you a few rules to implement but noted that more are already being developed.

These rules are:
 * If the **source country** is **Wordland** and the transfer amount is lesser than **10 000** then the fee should always be equal to **1**
 * If the **source country** is **Wordland** and the transfer amount is greater than **10 000** then the fee should always be equal to **0.1%** of the transfer amount
 * If the **source country** is **Wordland** and the **target country** is **Remitania** then the fee should always be equal to **1000** because of conflict between these countries
 * If the **source country** is **Remitania** then the fee should always be equal to the first digit of the transfer amount multiplied by **5** because of extraordinary tax regulation
 * If the **source country** is **Remitania** and the comment contains phrase "**summer 2010**" then there should be no fee because it is Remitania's Secret Service transfer
 
## Input
The input is an instance of `com.worldremit.recruitment.fee.domain.TransferData` class
 
## Output
Your application should return the integer value of calculated fee. For example for `TransferData` defined like
 ```
final TransferData data = new TransferData("Wordland", "Remitania", 10000, "no comment")
```  
the result should be `1000`

## Additional information
You should provide a comprehensive and well designed solution, easy to extend and to understand. Try to show best programming practices and use proper design patterns where they should be used. Remember about providing proper test cases.
