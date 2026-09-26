String spellingForBottles = "bottles";
String numberSpelling = "";

for (int i = 99; i >= 0; i--) {
  println(numberSpelling + " " + spellingForBottles + " of beer on the wall " + numberSpelling + " " + spellingForBottles + " of beer");
  if (i == 1) {
    spellingForBottles = "bottle";
  } else if (i == 0) {
    spellingForBottles = "bottles";
  }
  if (i > 0) {
    numberSpelling = "" + i;
  } else if (i == 0) {
    numberSpelling = "no more";
  }
  numberSpelling = "" + i;
}
