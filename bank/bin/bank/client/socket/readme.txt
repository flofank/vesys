Author: Florian Fankhauser
Date: 25.02.2014

Beschreibung der Client-Server Implementation via Sockets
-----------------------------------------------------------

Server:
Auf dem Server wird eine Standartimplementation von Account und Bank zur Verwaltung der 
"Bank" eingesetzt. Verwaltet wird diese Bank durch die Klasse SocketServer. Herzst�ck 
dieser Klasse ist die Methode "handle" welche �ber einen Socket eine Befehlszeile �ber-
nimmt verarbeitet und das Resultat zur�ckschreibt.

Client:
Die Clientimplementationen von Bank und Account enthalten keine wirkliche Logik sondern
leiten die Calls vom GUI and den SocketDriver weiter. Dieser nimmt den Befehl entgegen
�bermittelt ihn an den Server und Verarbeitet die Antwort wobei er auch das Fehlerhand-
ling �bernimmt.

Protokoll:
Das Kommunikationsprotokoll basiert auf der CSV-Definition und ist wie folgt aufgebaut.
Request: [String action],[Object... params]
Response: [int statuscode],[Object response]
