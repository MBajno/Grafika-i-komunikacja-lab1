Rysunek został zrobiony w Javie. Użyłem Graphics. Metoda super.paintcomponent(g) z klasy nadrzędnej, przygotowuje elementy do rysowania. 
Add(new Surface()); zostanie dodana powierzchnia do kontenera JFrame. Wcześniej ustawiałem wielkość rysunku oraz tytuł.
Tworzę instancje i ustawiłem ją na widzialną na ekranie. InvokeLater() umieszcza aplikację w kolejce zdarzeń Swing. Ponadto zastosowałem  
fillPolygon i drawPolygon.
