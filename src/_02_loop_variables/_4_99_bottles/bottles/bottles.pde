String s_s = "s";

for (int i = 99; i >= 0; i--){
  if (i >= 1){
    if (i == 1){
      s_s = " ";
    }
    println( i + " bottle" + s_s + " of beer on the wall " + i + " bottle"+ s_s + " of beer on the wall " + " take one down and pass it around ");
    if ((i-1) == 1){
      s_s = " ";
    }
    println((i-1) + " bottle" + s_s + " of beer on the wall ");
    println(" ");
  }
  else{
    println("no more bottles of beer on the wall no more bottles of beer go around and buy some more 99 bottles of beer on the wall");
  }
}
