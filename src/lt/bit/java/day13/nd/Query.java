package lt.bit.java.day13.nd;
/*
ND 11.14
--------
Tarkime turime DB užklausą su neapibrėžtu kiekiu AND kriterijų SELECT * FROM users WHERE name='Jonas' AND surname='Jonaitis'...
0. Sukurti buildQuery metodą (buildQuery(String table, Map<String, String> criteria)), kuris suformuoja dinaminę užklausą (siūlyčiau naudoti StringBuilder).
1. Sukurti metodą, kuris priima paruoštą užklausą ir pakeičia visus AND į OR.
2. Sukurti metodą, kuris priima paruoštą užklausą ir palieka tik pirmą kriterijų (rezultato pvz.: SELECT * FROM users WHERE name='Jonas')

Programa neturi nulūžti padavus null arba tuščią mapą, o užklausą turi likti teisinga (be WHERE, pvz. SELECT * FROM users).
--------
Parašykite parametrizuotą (generic) klasę, kuri realizuoja E tipo objektų
saugyklą. Taip pat padarykite kad juos galima iteruoti nurodant su lambda
išraiška, palyginančia du elementus, kokia tvarka bus iteruojame.
Pvz. jūsų klasė-konteineris vadinasi Container ir mes į jį dedame Employee
tipo objektus. Tada maždaug toks kodas turėtų veikti:
Container<Employee> box = new Container<>();
box.add(new Employee(…));
box.add(new Employee(…));
…
for (Employee emp : box.order((e1, e2) -> { … })) {
System.out.println(emp);
}
*/

public class Query {
}
