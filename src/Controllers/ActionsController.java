package Controllers;
import WorkItems.ManagerActions;
import org.openqa.selenium.WebDriver;

public class ActionsController {
    static public void ActionExecuter(WebDriver driver, String event, String xpath, String text){
        areEmpty(event, xpath);

        if(ManagerActions.CreateElementHtml(driver, xpath).isDisplayed()){
            switch (event){
                case "setText":
                    ManagerActions.SetText(driver, xpath, text);
                    break;

                case "selectOption":
                    ManagerActions.SelectOption(driver, xpath, text);
                    break;

                case "click":
                    ManagerActions.ToDoClick(driver, xpath);
                    break;
            }
        }
        else{
            System.out.println("Error: La locacion "+xpath+" no existe en este documento HTML");
        }
    }

    static private void areEmpty(String event, String xpath){
        if(event.isEmpty()){
            System.out.println("Error: No se indico el evento a ejecutar");
            return;
        }

        if(xpath.isEmpty()){
            System.out.println("Error: No se indico la locacion del elemento");
            return;
        }
    }
}
