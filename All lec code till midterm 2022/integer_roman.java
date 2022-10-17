import java.util.Scanner;
public class integer_roman {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the roman number that you want to convert in Integer: ");
        String s=sc.next();
        int sum=0;
        char []ch=s.toCharArray();
    for(int i=ch.length-1;i>=0;i--){
        switch(ch[i]){
            case 'I':
                if(i+1!=ch.length&&(ch[i+1]=='V'||ch[i+1]=='X')){
                    sum-=1;
                }
                else{
                    sum+=1;
                    break;
                    }
            case 'V':
                sum+=5;
                break;
            case 'X':
                if(i+1!=ch.length&&(ch[i+1]=='L'||ch[i+1]=='C')){
                    sum-=10;
                }
                else{
                    sum+=10;
                    }
                break;
            case 'L':
                sum+=50;
                break;
            case 'C':
                if(i+1!=ch.length&&(ch[i+1]=='D'||ch[i+1]=='M')){
                    sum-=100;
                }
                else{
                    sum+=100;
                    }
                break;
            case 'D':
                sum+=500;
                break;
            case 'M':
                sum+=1000;
                break;
                
                
        }
    }
         System.out.println(sum);
    }
}
