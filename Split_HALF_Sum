String str = "Jason:5758473295:345"

String[] splitString = str.split(":");

String temp = splitString[1];

int half = temp.length() % 2 == 0? temp.length()/2 : temp.length()/2 + 1;
String first = temp.substring(0,half);
String second = temp.substring(half);

int firstInt = Integer.parseInt(first);
int secondInt = Integer.parseInt(second);

//SUM
for(int i = 0; i < first.length(); i ++)
{
  sumFirst += firstInt % 10;
  firstInt /= 10;
}
 
