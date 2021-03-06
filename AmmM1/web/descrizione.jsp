<%-- 
    Document   : descrizione
    Created on : 16-mag-2016, 14.32.54
    Author     : Sara
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>La Bottega di Flo</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!-- Aggiungo keywords, breve descrizione e autore -->
        <meta name="keywords" content="shop, online, sell, makeup, too faced, ecobio,
              mac, kiko, essence">
        <meta name="description" content="Vendita di cosmetici di vari marchi">
        <meta name="author" content="Sara Flore">
        <link href="style.css" rel="stylesheet" type="text/css" media="screen" />
    </head>
    <body>
        <!--Titolo principale e descrizione sito -->
        <h1>La Bottega di Flo</h1>
        <p>In questo sito è possibile vendere ed acquistare cosmetici di vari marchi e di varie 
        fasce di prezzo.</p>
        <!--Inserisco la sezione di navigazione -->
        <nav><a href="login.html">Login</a></nav>
        <!--Sommario -->
        <ul>
            <li><a href="#cliente">Cosa puoi acquistare</a></li>
            <li><a href="#venditore">Come puoi vendere</a></li>
            <li><a href="#cosmetici">Tipologia cosmetici</a>
                <ul>
                    <li><a href="#viso">Viso</a></li>
                    <li><a href="#occhi">Occhi</a></li>
                    <li><a href="#labbra">Labbra</a></li>
                </ul>
            </li>
        </ul>
        <!-- Informazioni per clienti, venditori e sulla tipologia dei prodotti -->
        <h2 id="cliente">Cosa puoi acquistare</h2>
        <p>In questo sito potrai trovare tutto ciò che ti serve per un make up completo, con 
        i migliori prodotti per il viso, per gli occhi e per le labbra.
        Il nostro scopo è quello di far sentire bella ogni donna, di ogni età, dando la possibilità a tutte di 
        poter scegliere tra una vasta scelta di prodotti e varie fasce di prezzo.
        Ogni 20 euro di spesa, le spese di spedizione sono gratuite!
        Inoltre, se ti iscrivi alla nostra newsletter, avrai il 10% di sconto sul primo ordine!
        </p>
        <h2 id="venditore">Come puoi vendere</h2>
        <p>In questo sito è possibile mettere in vendita i prodotti del proprio marchio,
         per noi è importante dare visibilità ai marchi più famosi e non, per poter dare
         una più ampia scelta ai nostri clienti.
        Compilando il seguente form, verrete contattati per i dettagli contrattuali.</p>
        <h2 id="cosmetici">Tipologia cosmetici</h2>
        <h3 id="viso">Viso</h3>
        <p>Vasta scelta di primer, fondotinta per tutti i tipi di pelle, ciprie, correttori, blush e terre.</p>
        <h3 id="occhi">Occhi</h3>
        <p>Vasta scelta di primer occhi, ombretti di varie texture e finish, palette, mascara,
            eyeliner, matite e prodotti per le sopracciglia.</p>
        <h3 id="labbra">Labbra</h3>
        <p>Vasta scelta di matite labbra, rossetti dai vari finish, lip gloss, tinte a lunga durata 
            e trattamenti labbra.</p>
        
    </body>
</html>
