public class test {
    public static void main(String[] args) {
       int upper=0,lower=0,number=0,symbols=0,space=0,vowels=0;
       StringBuilder a=new StringBuilder("1234 QW qwere !@#%");
       for(int i=0; i<a.length(); i++){
           if(a.charAt(i)>=65 && a.charAt(i)<=90){
               upper++;
           }
           if(a.charAt(i)>=97 && a.charAt(i)<=122){
               lower++;
           }
           if(a.charAt(i)>=48 && a.charAt(i)<=57){
               number++;
           }
           if(a.charAt(i)==32){
               space++;
           }
           if(a.charAt(i)=='A' || a.charAt(i)=='E' || a.charAt(i)=='I' || a.charAt(i)=='O' || a.charAt(i)=='U' || a.charAt(i)=='A' ||
                   a.charAt(i)=='a' || a.charAt(i)=='e' || a.charAt(i)=='i' || a.charAt(i)=='o' || a.charAt(i)=='u' ){
               vowels++;
           }
       }
        System.out.println("upper"+ upper);
        System.out.println("lower"+ lower);
        System.out.println("number"+ number);
        System.out.println("space"+ space);
        System.out.println("vowles"+ vowels);
        System.out.println("symbols"+ (a.length()-(upper+lower+number+space)));
     }

}
