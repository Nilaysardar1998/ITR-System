/*Name : Nilay Sardar
 *Roll. no.: 37
 *Course : BCA (2020-23)
 *Team Name: Royal Challengers
 * Project Name: ITR System
 */
import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;
public class Itr_System {
    //Color Section
    public static final String TEXT_RESET="\u001B[0m";
    public static final String TEXT_RED="\u001B[31m";
    public static final String TEXT_GREEN="\u001B[32m";
    public static final String TEXT_YELLOW="\u001B[33m";
    public static void main(String[] args){
        System.out.print("\t\t\t Project on ITR SYSTEM\n");
        int dial_number;
        Scanner dial = new Scanner(System.in);
        System.out.print("Dial Airtel customer care no.: ");
        dial_number= dial.nextInt();
        if(dial_number == 121){
            System.out.print(TEXT_RED+"\t\t\tWelcome to Airtel\n"+TEXT_RESET);
            int language_selection = 0;
            System.out.print(TEXT_YELLOW+"=================Please Select Your Language================\n"+TEXT_RESET);
            System.out.print("\n1. English\t2. Quit");
            while(language_selection != 2){
                Scanner s = new Scanner(System.in);
                System.out.print("\nSelect Your Option: ");
                language_selection = s.nextInt();
                switch (language_selection) {
                    case 1 -> {
                        BigInteger number_01 = new BigInteger("917077223366");
                        System.out.print(TEXT_YELLOW+"==========================Main Menu=========================\n"+TEXT_RESET);
                        System.out.format(String.valueOf(number_01));
                        System.out.print("""
                                                                
                                1. Balance\t2.New Offers\t3.My Account Info
                                4. Recharge\t5. Other Services\t6. Quit
                                ============================================================
                                """);
                        int main_menu = 0;
                        while (main_menu != 6){
                            Scanner s2 = new Scanner(System.in);
                            System.out.print("Select Your Option: ");
                            main_menu = s2.nextInt();
                            switch (main_menu){
                                //Balance
                                case 1 -> System.out.print("""
                                   ==========================BALANCE===========================
                                   Your number: 917077223366
                                   Your Balance: Rs. 12.05, Your Data Balance: 50GB Which
                                   is going to expired on 05/07/21
                                   ============================================================
                                   """);
                                //New offers
                                case 2 -> {
                                            int new_offers =0;
                                             System.out.print("""
                                            ==========================NEW OFFERS========================
                                            1.Truly Unlimited\t2.Data\t3.Talk-time\t4.International Roaming
                                            5.Quit
                                            ============================================================
                                            """);
                                            while (new_offers !=5) {
                                            Scanner s3 = new Scanner(System.in);
                                            System.out.print("Select Your Option: ");
                                             new_offers = s3.nextInt();
                                                 switch (new_offers) {
                                                     case 1 -> {
                                                         System.out.print("""
                                                                 \t\tTruly Unlimited
                                                                 PLANS >>>>
                                                                 Rs.598\t Free Call on All Sim\t 1.5GB/Day\t Validity: 84 Days
                                                                 Rs.399\t Free Call on All Sim\t 1.5GB/Day\t Validity: 56 Days
                                                                 Rs.249\t Free Call on All Sim\t 1.5GB/Day\t Validity: 28 Days
                                                                 Rs.219\t Free Call on All Sim\t 1GB Data\t Validity: 28 Days
                                                                 Rs.698\t Free Call on All Sim\t 2GB/Day\t  Validity: 84 Days
                                                                 Rs.449\t Free Call on All Sim\t 2GB/Day\t  Validity: 56 Days
                                                                 Rs.298\t Free Call on All Sim\t 2GB/Day\t  Validity: 28 Days
                                                                 Rs.379\t Free Call on All Sim\t 6GB Data\t Validity: 84 Days
                                                                 Rs.149\t Free Call on All Sim\t 2GB Data\t Validity: 28 Days
                                                                 ============================================================
                                                                 """);
                                                         int a;
                                                         Scanner s5 = new Scanner(System.in);
                                                         System.out.print(TEXT_RED+"Want to Recharge, Press Yes for 1/No for 2]: "+TEXT_RESET);
                                                         a = s5.nextInt();
                                                         if (a == 1) {
                                                             int amount1;
                                                             Scanner s6 = new Scanner(System.in);
                                                             System.out.print(TEXT_RED+"Please Enter Your Amount to Recharge: "+TEXT_RESET);
                                                             amount1 = s6.nextInt();
                                                             System.out.print(TEXT_GREEN+"\t\tYour Recharge of " + amount1 + " Has successfully done...!!!\n"+TEXT_RESET);
                                                         } else if (a == 2) {
                                                             System.out.print(TEXT_RED+"No"+TEXT_RESET);
                                                         }
                                                     }
                                                     case 2 -> {
                                                         System.out.print("""
                                                                 \t\tData
                                                                 PLANS >>>>
                                                                 Rs.401\t 30GB Data\t Validity: 28 Days
                                                                 ============================================================
                                                                 """);
                                                         int b;
                                                         Scanner s7 = new Scanner(System.in);
                                                         System.out.println(TEXT_RED+"Want to Recharge, Press Yes for 1/No for 2]:"+TEXT_RESET);
                                                         b = s7.nextInt();
                                                         if (b == 1) {
                                                             int amount2;
                                                             Scanner s8 = new Scanner(System.in);
                                                             System.out.print(TEXT_RED+"Please Enter Your Amount to Recharge: "+TEXT_RESET);
                                                             amount2 = s8.nextInt();
                                                             System.out.print(TEXT_GREEN+"\t\tYour Recharge of " + amount2 + " Has successfully done...!!!\n"+TEXT_RESET);
                                                         } else if (b == 2) {
                                                             System.out.println(TEXT_RED+"No"+TEXT_RESET);
                                                         }


                                                     }
                                                     case 3 -> {
                                                         System.out.print("""
                                                                 \t\tTalk-time
                                                                 PLANS >>>>
                                                                 Rs.5000\t Talk-time: Rs.4237.29\t Validity: NA
                                                                 Rs.1000\t Talk-time: Rs.847.46\t Validity: NA
                                                                 Rs.500\t Talk-time: Rs.423.73\t Validity: NA
                                                                 Rs.100\t Talk-time: Rs.81.75\t Validity: NA
                                                                 Rs.20\t Talk-time: Rs.14.95\t Validity: NA
                                                                 Rs.10\t Talk-time: Rs.7.47\t\t Validity: NA
                                                                 ============================================================
                                                                 """);
                                                         int c;
                                                         Scanner s9 = new Scanner(System.in);
                                                         System.out.print(TEXT_RED+"Want to Recharge, Press Yes for 1/No for 2]: "+TEXT_RESET);
                                                         c = s9.nextInt();
                                                         if (c == 1) {
                                                             int amount3;
                                                             Scanner s10 = new Scanner(System.in);
                                                             System.out.print(TEXT_RED+"Please Enter Your Amount to Recharge: "+TEXT_RESET);
                                                             amount3 = s10.nextInt();
                                                             System.out.print(TEXT_GREEN+"\t\tYour Recharge of " + amount3 + " Has successfully done...!!!\n"+TEXT_RESET);
                                                         } else if (c == 2) {
                                                             System.out.print(TEXT_RED+"No"+TEXT_RESET);
                                                         }

                                                     }
                                                     case 4 -> {
                                                         System.out.print("""
                                                                 \t\tInternational Roaming
                                                                 PLANS >>>>
                                                                 Rs.6999
                                                                 Details: 500 mins incoming, 5GB, 500 mins local/India calls,\040
                                                                 100 sms.
                                                                 Covered countries: Nigeria, South Africa, Kenya, Uganda,\040
                                                                 Zambia & more.\s
                                                                 Validity: 30 Days
                                                                 For more Information Visit --> www.airtel.in/ir
                                                                                                                     
                                                                 Rs.5999
                                                                 Details: 300 mins Incoming, 300 mins India calls, 100 sms.
                                                                 Covered countries: Iran, Kuwait, Oman, Qatar, Russia, Saudi\040
                                                                 Arabia, UAE & more.\s
                                                                 Validity: 90 Days
                                                                 For more Information Visit --> www.airtel.in/ir
                                                                                                                     
                                                                 Rs.5998
                                                                 Details: Unlimited incoming, 1800 mins India calls, 100 sms.
                                                                 Cover countries: Australia, Canada, China, France, Japan, \040
                                                                 Singapore, USA, UK & more\s
                                                                 Validity: 90 Days
                                                                 For more Information Visit --> www.airtel.in/ir
                                                                 ============================================================
                                                                 """);
                                                         int d;
                                                         Scanner s11 = new Scanner(System.in);
                                                         System.out.print(TEXT_RED+"Want to Recharge, Press [Yes for 1/No for 2]: "+TEXT_RESET);
                                                         d = s11.nextInt();
                                                         if (d == 1) {
                                                             int amount4;
                                                             Scanner s12 = new Scanner(System.in);
                                                             System.out.print(TEXT_RED+"Please Enter Your Amount to Recharge: "+TEXT_RESET);
                                                             amount4 = s12.nextInt();
                                                             System.out.print(TEXT_GREEN+"\t\tYour Recharge of " + amount4 + " Has successfully done...!!!\n"+TEXT_RESET);
                                                         } else if (d == 2) {
                                                             System.out.print(TEXT_RED+"No"+TEXT_RESET);
                                                         }
                                                     }


                                                     case 5 -> System.out.print("Quit\n");
                                                     default -> System.out.print("Please Enter Valid Option...!!!\n");
                                        }
                                    }
                                }
                                //My Account Info
                                case 3 -> {
                                    System.out.print("\n========My Account Info==========\n");
                                    int my_account_info =0;
                                    System.out.print("1. Call Rates\t2. Deductions\t3. Data Services\t4. Quit\n");
                                    while (my_account_info != 4){
                                        Scanner s4 = new Scanner(System.in);
                                        System.out.print("Select Your Option: ");
                                        my_account_info = s4.nextInt();
                                        switch (my_account_info){
                                            case 1 -> System.out.print("""
                                                    \t\t\tCall Rates
                                                    Your Voice Rate : 25p/min
                                                    Your SMS Rate: Rs.1/SMS
                                                    Your Data Rate: 128kb/sec
                                                    """);
                                            case 2 -> System.out.print("\t\t\tDeductions\nNo Deductions are Present at this time\nNo deduction are Present in previous Month also");
                                            case 3 -> System.out.print("""
                                                    ========================Data Services=======================
                                                    \t\t\tIf not Working
                                                    1.Disable the mobile data, turn on again
                                                    The easiest way to fix a non-working mobile internet is by switching\040
                                                    off the mobile data option on your smartphone and then enabling\040
                                                    it again after a few seconds.\s
                                                    
                                                    2.Enable flight mode and disable to fix
                                                    This is another effective way to fix mobile data if it is\040
                                                    acting up. You can either head to the Settings menu or open\040
                                                    the notification panel to enable the flight mode. This will
                                                    cut all connections and then rebuild it again and that often\040
                                                    helps in the mobile internet working again. Keep the flight mode\040
                                                    enabled for a few seconds and then disable it.\s
                                                    
                                                    3.Check data plan if it expired
                                                    If your mobile data has stopped working the very first thing
                                                    you should do is to check your data plan. Whether your\040
                                                    mobile recharge pack has expired or not. If yes, recharge it\040
                                                    immediately to reactivate the service.\040
                                                  
                                                    4.Re-insert your SIM card
                                                    Another effective way to fix your mobile data speed\040\040
                                                    is by taking out the SIM card from your mobile\040
                                                    phone and re-inserting the SIM again. You will\040
                                                    need a SIM ejector tool to take out the SIM card from\040
                                                    the mobile phone.\s
                                                    
                                                    5.Restart your smartphone
                                                    Yet another simple way that can help boost your mobile\040
                                                    internet is restarting the device. Whether it’s\040
                                                    a network problem or any other, restarting the phone\040
                                                    most of the time helps in solving an issue on a\040
                                                    mobile phone.
                                                    ============================================================
                                                    """);
                                            case 4 -> System.out.print("Quit\n");
                                            default -> System.out.print("\nPlease Enter valid option...!!!");
                                        }
                                    }
                                }
                                //Recharges
                                case 4 -> {
                                    System.out.print("""
                                        ===========================Recharges========================
                                        Rs.128\t 0MB\t Local/STD @2.5/sec\t Validity: 28 Days
                                        Rs.79\t 200MB\t Local/STD/LL @60P/min\t Validity: 28 Days
                                        Rs.49\t 100MB\t Local/STD @2.5P/min\t validity: 28 Days
                                        ============================================================
                                        """);
                                    int e;
                                    Scanner s13 = new Scanner(System.in);
                                    System.out.print("\nWant to Recharge, Press Yes for 1/No for 2]: ");
                                    e = s13.nextInt();
                                    if (e == 1) {
                                        int amount4;
                                        Scanner s14 = new Scanner(System.in);
                                        System.out.print("Please Enter Your Amount to Recharge: ");
                                        amount4 = s14.nextInt();
                                        System.out.print("\t\tYour Recharge of " + amount4 + " Has successfully done...!!!\n");
                                    } else if (e == 2) {
                                        System.out.print("No");
                                    }
                                }
                                //Other Services
                                case 5 -> {
                                    System.out.print("==========================Airtel Bank========================\n");
                                    int ba;
                                    Scanner bc = new Scanner(System.in);
                                    System.out.print("Want to open bank account, Press 1.Yes/ 2.No: ");
                                    ba = bc.nextInt();
                                    if(ba ==1) {
                                        Scanner input = new Scanner (System.in);
                                        System.out.print("Input your first name: ");
                                        String fname = input.next();
                                        System.out.print("Input your last name: ");
                                        String lname = input.next();
                                        int age;
                                        Scanner s14 = new Scanner(System.in);
                                        System.out.print("Enter your age: ");
                                        age = s14.nextInt();
                                        if (age >= 18) {
                                            System.out.print(TEXT_GREEN + "You are Eligible for opening bank account\n" + TEXT_RESET);
                                            Random rd = new Random();
                                            int rdNum;
                                            String[] m = new String[12];
                                            for (int i = 0; i < 12; i++) {
                                                rdNum = rd.nextInt(12);
                                                m[i] = Integer.toString(rdNum);
                                            }
                                            System.out.print(fname+" "+lname+"Your Account no.: " + m[0] + m[1] + m[2] + m[3] + m[4] + m[5] + m[6] + m[7] + m[8] + m[9] + m[10] + m[11]);

                                        } else {
                                            System.out.print(fname+" "+lname+" You are not Eligible for opening bank account,You are less then 18\n");
                                        }
                                    }else if(ba==2) {
                                        System.out.print("No");
                                    }
                                    System.out.print("\n============================================================\n");
                                }
                                case 6 -> System.out.print("Quit\n");
                                default -> System.out.print("Please Enter Valid Option...!!!\n");
                            }
                        }
                    }

                    case 2 -> System.out.print("\nQuit\nThank you for Visiting...!!!");
                    default -> System.out.print("Please Enter Valid Option...!!!\n");
                }
            }
        }
        else{
            System.out.print(TEXT_RED+"\t\t\t\tInvalid Number\n"+TEXT_RESET);
            System.out.print(TEXT_GREEN+"Please re-run the Program and Input no. 121"+TEXT_RESET);
        }
    }
}