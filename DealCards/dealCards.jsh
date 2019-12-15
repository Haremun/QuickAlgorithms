int numberOfPlayers = Integer.valueOf(System.getProperty("players"));

List<String> cards = new ArrayList<String>();

String[] symbols = new String[] { "9", "10", "Jack", "Queen", "King", "Ace" };
String[] colors = new String[] {Character.toString((char)0x2660), Character.toString((char)0x2663), Character.toString((char)0x2665), Character.toString((char)0x2666)};

for (int i = 0; i < colors.length; i++){
  for (int j = 0; j < symbols.length; j++){
    cards.add(colors[i] + " " + symbols[j]);
  }
}

Collections.shuffle(cards);

int counter = 0;
List<ArrayList<String>> players = new ArrayList<>();

for(int i = 0; i < numberOfPlayers; i++){
  players.add(new ArrayList<>());
}

void dealCards(){
  for(String card: cards){
  players.get(counter).add(card);
  counter++;
  if(counter == numberOfPlayers)
    counter = 0;
  }
}
void showHand(List<String> hand){
  hand.forEach(System.out::println);
  System.out.println("");
}

dealCards();

players.forEach(x -> showHand(x));
/exit

