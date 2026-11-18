
class Digit
{
    public void DisplayDigits(int iNo)
    {
       int iNo=9752;
       int iDigit=0;
       while(iNo!=0)
       {
            iDigit = iNo % 10;
            iNo= iNo/10;                   
            System.out.println(iDigit); 
       }
    }
}
class program123
{
    public static void main(String[] args)
    {
        Digit digit =new Digit();
        digit.DisplayDigits(9752);
    } 
}