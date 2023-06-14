import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import scooter.Main;
import scooter.OrderPageOne;
import scooter.OrderPageTwo;


    @RunWith(Parameterized.class)
    public class TestOrder extends TestMain {

        Main main;
        OrderPageOne orderPageOne;
        OrderPageTwo orderPageTwo;

        String name;
        String surname;
        String address;
        String phoneNumber;
        String calendar;
        String comments;

        public TestOrder(String name, String surname, String address, String phoneNumber, String calendar, String comments) {
            this.name = name;
            this.surname = surname;
            this.address = address;
            this.phoneNumber = phoneNumber;
            this.calendar = calendar;
            this.comments = comments;

        }

        @Parameterized.Parameters
        public static Collection<Object[]> getCredentials() {
            return Arrays.asList(new Object[][]{
                    {"Алина", "Арсланова", "Комсомольская 5", "89965809099", "18.07.2023", "Надеюсь привезете в ближайшее время"},
                    {"Алексей", "Жигулев", "Аксакова 10", "89991311221", "29.08.2023", "-"},
            });
        }

        @Test
        public void orderByButtonUp() {
            main = new Main(driver);
            orderPageOne = new OrderPageOne(driver);
            orderPageTwo = new OrderPageTwo(driver);

            main.clickButtonOrderUp();

            orderPageOne.typeFieldName(name);
            orderPageOne.typeFieldSurname(surname);
            orderPageOne.typeFieldAddress(address);
            orderPageOne.clickDropdownMetro();
            orderPageOne.chooseListMetro();
            orderPageOne.typeFieldPhone(phoneNumber);
            orderPageOne.clickOrderButtonFurther();

            orderPageTwo.typeFieldCalendar(calendar);
            orderPageTwo.clickDropdownRentalPeriod();
            orderPageTwo.chooseRentalPeriodOneDay();
            orderPageTwo.chooseScooterColourBlack();
            orderPageTwo.typeFieldComments(comments);
            orderPageTwo.clickButtonOrder();
            orderPageTwo.checkTextQuestionOrder();
            orderPageTwo.clickButtonOrderYes();
            orderPageTwo.checkOrderSuccessfullyDone();
        }
        @Test
        public void orderByButtonDown() {
            main = new Main(driver);
            orderPageOne = new OrderPageOne(driver);
            orderPageTwo = new OrderPageTwo(driver);

            main.scrollBlockOrderDown();
            main.clickButtonOrderDown();

            orderPageOne.typeFieldName(name);
            orderPageOne.typeFieldSurname(surname);
            orderPageOne.typeFieldAddress(address);
            orderPageOne.clickDropdownMetro();
            orderPageOne.chooseListMetro();
            orderPageOne.typeFieldPhone(phoneNumber);
            orderPageOne.clickOrderButtonFurther();

            orderPageTwo.typeFieldCalendar(calendar);
            orderPageTwo.clickDropdownRentalPeriod();
            orderPageTwo.chooseRentalPeriodOneDay();
            orderPageTwo.chooseScooterColourBlack();
            orderPageTwo.typeFieldComments(comments);
            orderPageTwo.clickButtonOrder();
            orderPageTwo.checkTextQuestionOrder();
            orderPageTwo.clickButtonOrderYes();
            orderPageTwo.checkOrderSuccessfullyDone();
        }
    }

