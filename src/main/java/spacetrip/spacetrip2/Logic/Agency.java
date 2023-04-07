package spacetrip.spacetrip2.Logic;

import java.io.*;


public class Agency implements Serializable {

    Account account;
    Data data;

    public Account login(String login, String password) throws IOException {

        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("data.txt"));
            data = (Data) in.readObject();
            in.close();
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
        account = data.accountsHashMap.get(login + password);


        if (account != null) {
            return account;
        } else {
            return null;
        }

    }

    public Account signUp(String name, String surname, String race, String login, String password, boolean pet) {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("data.txt"));
            data = (Data) in.readObject();
            in.close();
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
        account = new Account(name, surname, race, login, password, pet);
        data.accountsHashMap.put(account.getLogin() + account.getPassword(), account);
        try {
            FileOutputStream fout = new FileOutputStream("data.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(data);
            out.flush();
            out.close();
            return account;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

}




