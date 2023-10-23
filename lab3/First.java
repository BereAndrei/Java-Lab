package lab3;

public class First {

    public static void main(String[] args){
        int flag = 1;
        int[] num={7,9,13,11,22,54};
        for(int i=0;i<num.length;i++){
            flag = 1;
            for(int j=2;j<=(num[i]/2);j++){
                if(num[i]%j==0)
                    flag = 0;
            }
            if(flag == 1 && num[i]>1) {
                System.out.print(num[i]);
                System.out.print(' ');
            }
        }





    }

}
