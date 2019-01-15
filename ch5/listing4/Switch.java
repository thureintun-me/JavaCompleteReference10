import javax.swing.JOptionPane;

public class Switch{
  public static void main(String[] args) {
    int month = 0;
    String season;

    month = Integer.parseInt(JOptionPane.showInputDialog("Enter a month !"));

    switch(month){
      case 12:
      case 1:
      case 2:
      season="Winter";
      break;

      case 5:
      case 4:
      case 3:
      season ="Spring";
      break;

      case 8:
      case 7:
      case 6:
      season = "Summer";
      break;
      case 11:
      case 9:
      case 10:
      season="Autumn";
      break;
      default:
      season ="Bogus Month";

    }
    JOptionPane.showMessageDialog(null,season);
  }
}
