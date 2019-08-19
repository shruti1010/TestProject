set projectPath=C:\Users\shrut\eclipse-workspace\TestProject
cd %projectPath%
set classpath=%projectPath%\bin;%projectPath%\lib\*;
java org.testng.TestNG testng.xml
pause