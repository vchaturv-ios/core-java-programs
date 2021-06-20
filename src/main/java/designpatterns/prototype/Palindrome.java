package designpatterns.prototype;

public class Palindrome {
  public boolean checkPalindrome(int num) {
    //841 => 148
    int temp = num;
    int rev = 0;
    while (num > 0) {
      int rem = num%10;
      rev = (rev*10)+rem;
      num = num/10;
    }

    if(rev == temp)
      return true;
    else
      return false;

  }
  public static void main(String[] args) {
    Palindrome palindrome = new Palindrome();
    if(palindrome.checkPalindrome(353))
      System.out.println("Number is palindrome");
    else
      System.out.println("Number is not palindrome");
  }

  //FOR A SCHOOL, STUDENTS FROM CLASS 5 WHOSE SCORES THE HIGHEST MARK IN MATHS

  //select * from school where math_marks in (select max(math_marks) from school top 3);
}
