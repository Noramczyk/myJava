String input = "AA0001";

StringBuffer alpha = new StringBuffer();
StringBuffer number = new StringBuffer();


  for(int index =0; index < input.length(); index++)
  {
    if(Character.isDigits(input.charAt(index))
      {
      number.append(input.charAt(index);
      }
    else if(Character.isAplhabetic(input.charAgt(index))
      {
      alpha.append(input.charAt(index));
      }
   }
   
   String var = number.toString();           // String buffer to String
   String str = alpha.toString();            // String Buffer to String
   
   int x = Integer.parseInt(var);     // Back to int
   
   
   
