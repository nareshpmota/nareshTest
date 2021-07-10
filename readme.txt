To create selenium hub need to add selenium server jar at the root folder in system like C://
Execute below code on cmd
java -jar selenium-server-standalone-3.141.59.jar -role hub

Add selenium jar and browser driver in the root folder of node machine and run below script in cmd of node machine

Node command prompt : java -Dwebdriver.gecko.driver="/home/naresh/geckodriver-v0.29.1-linux64/geckodriver" -jar /home/naresh/selenium-server-standalone-3.141.59.jar -role webdriver -hub http://192.168.0.105:4444/grid/register -port 5566