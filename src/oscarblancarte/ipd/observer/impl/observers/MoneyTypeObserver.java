package oscarblancarte.ipd.observer.impl.observers;

import oscarblancarte.ipd.observer.impl.ConfigurationManager;
import oscarblancarte.ipd.observer.impl.IObserver;
/**
 *
 * @author rjaimea
 */
public class MoneyTypeObserver implements IObserver{
    @Override
    public void notifyObserver(String command, Object source) {
        if(command.equals("moneyType")){
            ConfigurationManager conf = (ConfigurationManager)source;
            System.out.println("Observer ==> MoneyTypeObserver.moneyFormatChange > " 
                    + conf.getMoneyType().format(20));
        }
    }
}
