<%-- 
    Document   : venditore
    Created on : 16-mag-2016, 14.33.20
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
        <title>Area venditore</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!-- Aggiungo keywords, breve descrizione e autore -->
        <meta name="keywords" content="shop, online, sell, makeup">
        <meta name="description" content="Area venditore">
        <meta name="author" content="Sara Flore">
        <link href="style.css" rel="stylesheet" type="text/css" media="screen" />
    </head>
    <body>
        <!--Inserisco la sezione di navigazione -->
        <nav>
            <a href="descrizione.html">Home</a>
            <a href="login.html">Login</a>
        </nav>
            
        <h1>Vendita di un prodotto</h1>
        <p>Compila questo form con tutte le informazioni sul prodotto che vuoi vendere.</p>
        
        <!--Form per l'inserimento delle informazioni -->
        <form method="POST">   
        
        <!-- Nome del prodotto-->
        <div>
            <label for="NomeProdotto">Nome prodotto</label>
            <input type="text" name="NomeProdotto" id="NomeProdotto" />
        </div>
        <!--Url immagine descrittiva del prodotto -->
        <div>
            <label for="Url">URL immagine prodotto</label>
            <input type="url" name="Url" id="Url" />
        </div>
        <!--Area per la descrizione del prodotto -->
        <div>
            <label for="Descrizione">Descrizione</label>
            <textarea name="Descrizione" id="Descrizione"
                  rows="10" cols="40">Descrizione del prodotto</textarea>
        </div>
        <!--Prezzo prodotto -->
        <div> 
            <label for="Prezzo">Prezzo</label>
            <input type="number" name="Prezzo" step='0.01' id="Prezzo" />
        </div>
        <!-- Quantità disponibile -->
        <div>
        <label for="Quantità">Quantità</label>
        <input type='number' name='Quantità' id="Quantità"/>
        </div>
        
        <!--Pulsanti per inviare e resettare -->
        <div>
            <input type="submit" value="Invia"/>
            <input type="reset" value="Reimposta"/>
        </div>
        </form>
    </body>
</html>