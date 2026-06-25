//First Program of Java 
public class P1{
         public static void main(String[] args){
                     System.out.println("Hello Chacha");
                     System.out.println("kaise ho!");
             }
    }

C:\Softpro26\Java>javac --version
javac 24.0.2

C:\Softpro26\Java>java --version
java 24.0.2 2025-07-15
Java(TM) SE Runtime Environment (build 24.0.2+12-54)
Java HotSpot(TM) 64-Bit Server VM (build 24.0.2+12-54, mixed mode, sharing)

C:\Softpro26\Java>javac --version
javac 24.0.2

C:\Softpro26\Java>start notepad
C:\Softpro26\Java>start notepad P1.java

C:\Softpro26\Java>javac P1.java

C:\Softpro26\Java>dir
 Volume in drive C is OS
 Volume Serial Number is E662-0D42

 Directory of C:\Softpro26\Java

24-06-2026  10:31    <DIR>          .
24-06-2026  10:06    <DIR>          ..
24-06-2026  10:31               410 P1.class
24-06-2026  10:27               173 P1.java
               2 File(s)            583 bytes
               2 Dir(s)  317,562,990,592 bytes free

C:\Softpro26\Java>java P1
Hello Chacha

C:\Softpro26\Java>javac P1.java

C:\Softpro26\Java>java P1
Hello Chacha
kaise ho

C:\Softpro26\Java>java P1
Hello Chacha
kaise ho

C:\Softpro26\Java>javac P1.class
error: invalid flag: P1.class
Usage: javac <options> <source files>
use --help for a list of possible options

C:\Softpro26\Java>javac P1.java

C:\Softpro26\Java>dir
 Volume in drive C is OS
 Volume Serial Number is E662-0D42

 Directory of C:\Softpro26\Java

24-06-2026  10:31    <DIR>          .
24-06-2026  10:06    <DIR>          ..
24-06-2026  10:42               437 P1.class
24-06-2026  10:41               228 P1.java
               2 File(s)            665 bytes
               2 Dir(s)  317,560,500,224 bytes free

C:\Softpro26\Java>java P1
Hello Chacha
kaise ho!

C:\Softpro26\Java>start notepad P2.java

C:\Softpro26\Java>javac P2.java
P2.java:2: error: class P1 is public, should be declared in a file named P1.java
public class P1{
       ^
1 error

C:\Softpro26\Java>javac P2.java

C:\Softpro26\Java>java P2
Hello Chacha
kaise ho!

C:\Softpro26\Java>start notepad P4.java
