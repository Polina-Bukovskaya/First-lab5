import java.util.Scanner;
class Fraction {
    int numerator=1, denominator=1;
    String frac=numerator+"/"+denominator;

    void reduction(){

        int h=2,a=0,b=0,p=0;
        a=this.numerator;b=this.denominator;
        while (h<=this.numerator){
            if (a%h==0 && b%h==0){
                a=a/h;
                b=b/h;
                p=1;

            }
            else{h=h+1;}
        }
        if (p==1) {
            this.numerator = a;
            this.denominator = b;
        }
    }

    int getNum(){return numerator;}
    int getDen(){return denominator;}
    void setNum(int x){this.numerator = x;frac=numerator+"/"+denominator;}
    void setDen(int x){this.denominator = x;frac=numerator+"/"+denominator;}
    void createFrac(int x,int y){this.numerator=x;this.denominator=y;frac=numerator+"/"+denominator;}
    String getFrac(){return numerator+"/"+denominator;}


    void sumFracs(Fraction f1, Fraction f2){  //f1+f2
        int a,b;
        a=f1.getNum()*f2.getDen()+f2.getNum()*f1.getDen();
        b=f1.getDen()*f2.getDen();
        this.frac=a+"/"+b;
        this.numerator=a;
        this.denominator=b;

    }
    void addFrac(Fraction frac){  // this+frac
        this.numerator= this.numerator*frac.getDen()+this.denominator*frac.getNum();
        this.denominator=this.denominator*frac.getDen();
        this.frac=numerator+"/"+denominator;

    }

    void differenceFracs(Fraction f1, Fraction f2){  // f1-f2
        int a,b;
        a=f1.getNum()*f2.getDen()-f2.getNum()*f1.getDen();
        b=f1.getDen()*f2.getDen();
        this.frac=a+"/"+b;
        this.numerator=a;
        this.denominator=b;

    }
    void subtractFrac(Fraction frac){ //this - frac
        this.numerator= this.numerator*frac.getDen()-this.denominator*frac.getNum();
        this.denominator=this.denominator*frac.getDen();
        this.frac=numerator+"/"+denominator;

    }
    void productFracs(Fraction f1, Fraction f2){  // f1*f2
        int a,b;
        a=f1.getNum()*f2.getNum();
        b=f1.getDen()*f2.getDen();
        this.frac=a+"/"+b;
        this.numerator=a; // каскадное присваевание
        this.denominator=b;

    }
    void multiplyFrac(Fraction frac){ //this * frac
        this.numerator= this.numerator*frac.getNum();
        this.denominator=this.denominator*frac.getDen();
        this.frac=numerator+"/"+denominator;

    }

    void quotientFracs(Fraction f1, Fraction f2){  // f1/f2
        int a,b;
        a=f1.getNum()*f2.getDen();
        b=f1.getDen()*f2.getNum();
        this.frac=a+"/"+b;
        this.numerator=a;
        this.denominator=b;

    }
    void divideFrac(Fraction frac){ //this / frac
        this.numerator= this.numerator*frac.getDen();
        this.denominator=this.denominator*frac.getNum();
        this.frac=numerator+"/"+denominator;

    }



}



public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int z;
        Fraction f1=new Fraction();
        Fraction f2=new Fraction();
        Fraction f3=new Fraction();

        System.out.println("Input numerator 1");
        while (true){
            if (!scan.hasNextInt()){System.out.println("Input int!");scan.next();}
            else {f1.setNum(scan.nextInt());break;}
        }
        System.out.println("Input denominator 1");
        while (true){
            if (!scan.hasNextInt()){System.out.println("Input int!");scan.next();}
            else {z=scan.nextInt();
                if (z!=0){f1.setDen(z);break;} // try catch в класс
                else{System.out.println("Input not a zero!");scan.next();}
            }
        }

        System.out.println("Input numerator 2");
        while (true){
            if (!scan.hasNextInt()){System.out.println("Input int!");scan.next();}
            else {f2.setNum(scan.nextInt());break;}
        }
        System.out.println("Input denominator 2");
        while (true){
            if (!scan.hasNextInt()){System.out.println("Input int!");scan.next();}
            else {z=scan.nextInt();
                if (z!=0){f2.setDen(z);break;}
                else{System.out.println("Input not a zero!");scan.next();}
            }
        }

        f3.createFrac(1,1);

        System.out.println("f1 = Fraction 1 = " + f1.getFrac());
        System.out.println("f2 = Fraction 2 = " + f2.getFrac());
        System.out.println("f3 = Fraction 3 = " + f3.getFrac());

        f3.sumFracs(f1,f2);
        f3.reduction();
        System.out.println("f1 + f2 =" + f3.getFrac());




        f3.setNum(f1.getNum());
        f3.setDen(f1.getDen());
        f3.addFrac(f2);
        f3.reduction();
        System.out.println("f1 + f2 =" + f3.getFrac());

        f3.differenceFracs(f1,f2);
        System.out.println("f1 - f2 =" + f3.getFrac());

        f3.setNum(f1.getNum());
        f3.setDen(f1.getDen());
        f3.subtractFrac(f2);
        f3.reduction();
        System.out.println("f1 - f2 =" + f3.getFrac());

        f3.productFracs(f1,f2);
        f3.reduction();
        System.out.println("f1 * f2 =" + f3.getFrac());
        f3.setNum(f1.getNum());
        f3.setDen(f1.getDen());
        f3.multiplyFrac(f2);
        f3.reduction();
        System.out.println("f1 * f2 =" + f3.getFrac());

        f3.quotientFracs(f1,f2);
        f3.reduction();
        System.out.println("f1 / f2 =" + f3.getFrac());
        f3.setNum(f1.getNum());
        f3.setDen(f1.getDen());
        f3.divideFrac(f2);
        f3.reduction();
        System.out.println("f1 / f2 =" + f3.getFrac());

    }
}
