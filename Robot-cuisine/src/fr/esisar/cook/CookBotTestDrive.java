package fr.esisar.cook;

public class CookBotTestDrive {

	public static void main(String[] args) {
		CookBot robot = new CookBot();
        robot.switchOn();
        robot.regularCook();
        robot.switchOn();
        robot.switchOff();

        robot.switchOn();
        robot.switchOff();
        robot.regularCook();
        
        robot.switchOn();
        robot.regularCook();
        robot.slowCook();
        robot.switchOff();
        robot.slowCook();
        
        
	}

}
