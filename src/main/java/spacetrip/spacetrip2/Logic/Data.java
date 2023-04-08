package spacetrip.spacetrip2.Logic;

import spacetrip.spacetrip2.Galalxies.*;
import spacetrip.spacetrip2.Logic.Account;

import java.io.Serializable;
import java.util.*;

public class Data implements Serializable {
    HashMap<String, Account> accountsHashMap;

    Galaxy[] galaxies;

   public  Data() {
        accountsHashMap = new HashMap<String, Account>();
        Account account=new Account("Anton", "Sparrow",  "human", "toha1995", "anton95", true);
        accountsHashMap.put(account.getLogin()+account.getPassword(), account);
    }

    public Data(int i){
        galaxies = new Galaxy[3];
        galaxies[0]=new SmallGalaxy("Sovetskaya");
        galaxies[1]=new Galaxy("HFG");
        galaxies[2]=new BigGalaxy("MCG");
    }

    public void print(){
        System.out.println(this.galaxies[0].getName()+" :");
        this.galaxies[0].getPlanetsNames();
        System.out.println(this.galaxies[1].getName()+" :");
        this.galaxies[1].getPlanetsNames();
        System.out.println(this.galaxies[2].getName()+" :");
        this.galaxies[2].getPlanetsNames();

    }
}