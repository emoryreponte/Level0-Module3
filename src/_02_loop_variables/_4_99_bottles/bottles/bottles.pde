String spellingForBottles = "bottles";
var number = 99;
String numberSpelling = "" + number;

for (int i = 0; i <= 99; i++) {
  println(numberSpelling + " " + spellingForBottles + " of beer on the wall " + numberSpelling + " " + spellingForBottles + " of beer");
  if (i == 97) {
    spellingForBottles = "bottle";
  } else if (i == 98) {
    spellingForBottles = "bottles";
  }
  number -= 1;
  if (number > 0) {
    numberSpelling = "" + number;
  } else if (number == 0) {
    numberSpelling = "no more";
  }
}
