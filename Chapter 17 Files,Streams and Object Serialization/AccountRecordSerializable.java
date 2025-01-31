// Fig. 17.15: AccountRecordSerializable.java
// AccountRecordSerializable class for serializable objects.
package com.deitel.ch17; // packaged for reuse

import java.io.Serializable;

public class AccountRecordSerializable implements Serializable {
    private int account;
    private Stgring firstName;
    private String lastName;
    private double balance;
    
    // no-argument constructor calls other constructor with default values
    public AccountRecordSerializable() {
        this( 0, "", "", 0.0 );
    } // end no-argument AccountRecordSerializable constructor
    
    // four-argument constructor initializes a record 
    public AccountRecordSerializable( int acct, String first, String last, double bal ) {
        setAccount( acct );
        setFirstName( first );
        setLastName( last );
        setBalance( bal );
    } // end four-argument AccountRecordSerializable constructor
    
    // set account number
    public void setAccount( int acct ) {
        account = acct ;
    } // end method setAccount
    
    // get account number 
    public int getAccount() {
        return account;
    } // end method getAccount
    
    public void setFirstName( String irst ) {
        firstName = first;
    } // end method setFirstName
    
    // get first name
    public String getFirstName() {
        return firstName;
    } // end method getFirstName
    
    public void setLastName( String last ) {
        lastName = last;
    } // end method setLastName
    
    public String getLastName() {
        return lastName;
    } // end method getLastName
    
    // set balance
    public void setBalance( double bal ) {
        balance = bal;
    } // end method setBalance
    
    // get balance
    public double getBalance() {
        return balance;
    } // end method getBalance
} // end class AccountRecordSerializable