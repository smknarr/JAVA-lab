package defPackage;
import java.util.*;

interface EncryptDecrypt {
    public void Encrypt(int a, int b);
    public void Decrypt(int a, int b);
}

class Number implements EncryptDecrypt {
    int number;
    Number(int n) {
        number=n;
    }
    public void Encrypt(int a, int b) {
        int i=0,n=0,m=number;
        while(m!=0) {
            int d=m%10;
            if(a==1)
                n+=(int)(Math.pow(10, i)*((d+b)%10));
            else
                n+=(int)(Math.pow(10, i)*((10+d-b)%10));
            m=m/10;
            i++;
        }
        number = n;
        System.out.println("Encrypted number: " + n);
    }
    public void Decrypt(int a, int b) {
        int i=0,n=0,m=number;
        while(m!=0) {
            int d=m%10;
            if(a==1)
                n+=(int)(Math.pow(10, i)*((d-b)%10));
            else
                n+=(int)(Math.pow(10, i)*((d+b)%10));
            m=m/10;
            i++;
        }
        System.out.println(n);
    }
}

class Message implements EncryptDecrypt {
    String message;
    Message(String m) {
        message=m;
    }
    public void Encrypt(int a, int b) {
        int l=message.length(),i;
        char ch;
        String msg="";
        for(i=0;i<l;i++) {
            ch=message.charAt(i);
            if(a==1)
                msg=msg+(char)((ch+b-65)%26+65);
            else if(a==2)
                msg=msg+(char)((ch-b+65)%26+65);
        }
        message = msg;
        System.out.println("Encrypted message: " + msg);
    }
    public void Decrypt(int a, int b) {
        int l=message.length(),i;
        char ch;
        String msg="";
        for(i=0;i<l;i++) {
            ch=message.charAt(i);
            if(a==1)
                msg=msg+(char)((ch-b-65)%26+65);
            else if(a==2)
                msg=msg+(char)((ch+b-65)%26+65);
        }
        System.out.println(msg);
    }
}

public class P5Caesar {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a, eType, shift;
        String s;
        System.out.println("Enter encryption type, 1 for forward and 2 for backward: ");
        eType=sc.nextInt();
        System.out.println("Enter the shift: ");
        shift=sc.nextInt();
        System.out.println("Enter number to be encrypted: ");
        Number n = new Number(sc.nextInt());
        n.Encrypt(eType, shift);
        sc.nextLine();
        System.out.println("Enter the message to be encrypted: ");
        Message m = new Message(sc.nextLine());
        m.Encrypt(eType, shift);
        System.out.println("Decrypted number and message: ");
        n.Decrypt(eType, shift);
        m.Decrypt(eType, shift);
    }
}
//ref:www.github.com/narenchandra859