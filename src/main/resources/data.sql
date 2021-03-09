insert into users(date_of_birth, first_name, last_name, login, password, sex)
VALUES ('1980-10-19', 'Kamil', 'Stoch', 'stoczek12', 'skoki12', 'M');


insert into planets(description, distance_from_the_sun, name)
values ('pierwsza według oddalenia od Słońca planeta Układu Słonecznego. Jest planetą wewnętrzną, skalistą, zwaną także planetą „Lodu i ognia”. W ciągu doby występują 2 wschody i zachody Słońca. Obieg wokół Słońca 88 dni. Obrót wokół własnej osi 59 dni. Średnica 4 900 km. Odległość od Słońca 58 mln km. W dzień temperatura rozgrzewa się do 430C a w nocy spada do -170C. Nie posiada atmosfery. Nie ma księżyca.',
        58000000, 'Merkury');
insert into planets(description, distance_from_the_sun, name)
values ('druga według oddalenia od Słońca planeta Układu Słonecznego. Znana jest również pod nazwą Jutrzenki i jest najjaśniejszym ciałem niebieskim na niebie po Słońcu i Księżycu. Jest to planeta wewnętrzna, skalista. Masa, rozmiar i kształt podobne do Ziemi. Obieg wokół Słońca 225 dni. Obrót wokół własnej osi 243 dni. Średnica 12 100 km. Odległość od Słońca 108 mln km. Temp. Powierzchni 475C. Atmosfera zawiera pary i krople kwasu siarkowego (VI). Nie ma księżyca.',
        108000000, 'Wenus');
insert into planets(description, distance_from_the_sun, name)
values ('trzecia według oddalenia od Słońca planeta Układu Słonecznego. Jest ona największa ze wszystkich planet wewnętrznych. Powierzchnię głównie zajmują oceany. Obieg wokół Słońca 365 dni. Obrót wokół własnej osi 24 h. Odległość od Słońca wynosi jedną jednostkę astronomiczną 150 mln km. Temp. Powierzchni 14C. Atmosfera właściwa, złożona z 78% azotu, 21% tlenu i 1% innych gazów. Posiada 1 naturalnego satelitę, czyli Księżyc.',
        150000000, 'Ziemia');
insert into planets(description, distance_from_the_sun, name)
values ('czwarta według oddalenia od Słońca planeta Układu Słonecznego. Planeta skalista, wewnętrzna. Występuje woda i żelazo, czapy lodowe, pory roku, a także złożona atmosfera. Obieg wokół Słońca 2 lata. Obrót wokół własnej osi 24 h. Średnica 6 800 km. Odległość od Słońca 228 mln km. Temp. pow. od –93 do 27*C. Posiada 2 księżyce.',
        228000000, 'Mars');
insert into planets(description, distance_from_the_sun, name)
values ('piąta według oddalenia od Słońca planetą Układu Słonecznego. Jest on zarazem największą i najcięższą planetą. Jest planetą gazową, zewnętrzną. Ma bardzo małą gęstość. Ciśnienie rzędu kilku milionów atmosfer i wodór staje się metalem. Obieg wokół Słońca 12 lat. Obrót wokół własnej osi 10 h. Średnica 143 000 km. Odległość od Słońca 778 mln km. Temp. pow. –150*C. Posiada 32 księżyce (Europa).',
        778000000, 'Jowisz');
insert into planets(description, distance_from_the_sun, name)
values ('szósta według oddalenia od Słońca planeta Układu Słonecznego. Jest to planeta gazowa, zewnętrzna. Gęstość materii z jakiej jest zbudowany jest mniejsza od gęstości wody. Masa 75 razy większa od masy Ziemi. Obieg wokół Słońca 30 lat. Obrót wokół własnej osi 10 h. Średnica 121 000 km. Odległość od Słońca 1 430 mln km. Temp. pow. –180*C. Posiada 3 pierścienie. 28 księżyców, z których 2 mają atmosferę właściwą, a największy Tytan ma gęstą atmosferę.',
        1430000000, 'Saturn');
insert into planets(description, distance_from_the_sun, name)
values ('siódma według oddalenia od Słońca planeta Układu Słonecznego. Jest to planeta gazowa, zewnętrzna. Został on odkryty w 1871r. Spowity metanem. Obieg wokół Słońca 84 lata. Obrót wokół własnej osi – 17 h. Średnica 52 400 km. Odległość od Słońca 2 900 mln km. Temp. pow. od –271*C do –213*C. Posiada pierścienie i 15 księżyców (Miranda).',
        2900000000, 'Uran');
insert into planets(description, distance_from_the_sun, name)
values ('ósma według oddalenia od Słońca planeta Układu Słonecznego. Został on odkryty w 1846r. Jest to planeta gazowa, zewnętrzna. Atmosfera niebieska od zawartego w niej metanu. Obieg wokół Słońca – 165 lat. Obieg wokół własnej osi 18 h. Średnica 50 000 km. Odległość od słońca 4 500 mln km. Temp. pow. –210*C. Posiada 4 bardzo rzadkie i wąskie pierścienie, a także ok.15 księżyców (Tryton).',
        4500000000, 'Neptun');
insert into planets(description, distance_from_the_sun, name)
values (' Został on odkryty dopiero w 1930r.. Obieg wokół Słońca 248 lat. Obrót wokół własnej osi 6h. Średnica 2300 km. Odległość od Słońca 6000 mln km. Temp. pow. –230*C. Posiada 1 księżyc (Charon), bardzo do siebie podobny. Od odkrycia do 2006 roku Pluton oficjalnie był uznawany za dziewiątą planetę Układu Słonecznego.',
        6000000000, 'Pluton');


insert into ports(description, name, planet_id)
VALUES ('Szary port szarych ludzi', 'BialystokSkyLab', 1);


insert into ports(description, name, planet_id)
VALUES ('Goracy port dla goracych lasek', 'Wenusolab', 2);

insert into ports(description, name, planet_id)
VALUES ('Port, w ktorym na start musisz wyzerowac 1/2 litra Bożego napoju', 'Galaktyka Andromedy', 3);


insert into ports(description, name, planet_id)
VALUES ('Kazdy material jest tu z marka Tesli', 'Elonmuskolandia', 4);


insert into ports(description, name, planet_id)
VALUES ('Tubylcy lubią tu belgijskie piwo', 'Jupiter', 5);

insert into ports(description, name, planet_id)
VALUES ('Kupisz tu sprzet RTV AGD', 'Saturnik', 6);

insert into ports(description, name, planet_id)
VALUES ('Boskie miejsce', 'Zeusa', 7);

insert into ports(description, name, planet_id)
VALUES ('Wszedzie trójzęby, wodnisto', 'Posejdon', 8);

insert into ports(description, name, planet_id)
VALUES ('Kosmiczne Zooo', 'CartonNetwork', 9);
