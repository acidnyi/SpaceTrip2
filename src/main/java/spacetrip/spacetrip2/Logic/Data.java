package spacetrip.spacetrip2.Logic;

import spacetrip.spacetrip2.Logic.Account;

import java.io.Serializable;
import java.util.*;

public class Data implements Serializable {
    HashMap<String, Account> accountsHashMap;

   public  Data() {
        accountsHashMap = new HashMap<String, Account>();
        Account acount=new Account("Anton", "Sparrow",  "human", "toha1995", "anton95", true);
        accountsHashMap.put(acount.getLogin()+acount.getPassword(), acount);
    }


}