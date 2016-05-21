<%-- 
    Document   : cliente
    Created on : 16-mag-2016, 14.32.12
    Author     : Sara
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Acquista su La Bottega di Flo</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
          <!-- Aggiungo keywords, breve descrizione e autore -->
        <meta name="keywords" content="shop, online, buy, makeup, too faced, ecobio,
              mac, kiko, essence">
        <meta name="description" content="Vendita di cosmetici di vari marchi">
        <meta name="author" content="Sara Flore">
        <link href="style.css" rel="stylesheet" type="text/css" media="screen" />
    </head>
    <body>
        <!--Inserisco la sezione di navigazione -->
        <nav>
            <a href="descrizione.html">Home</a>
            <a href="login.html">Login</a>
        </nav>
        
        <h1>Elenco prodotti acquistabili</h1>
        <!--Creo la tabella dei prodotti -->
        <table>
            <tr>
                <th>Prodotto</th>
                <th>Foto</th>
                <th>Quantità</th>
                <th>Prezzo</th>
                <th>Acquisto</th>
            </tr>
            <tr>
                <c:forEach var = "a" items = "${listaOggetti}">
                    <!-- generazione dinamica degli oggetti-->
                    <td> "${a.getNomeOggetto}"</td>
                    <td> <img src="${a.getUrlOggetto}" title="${a.getNomeOggetto}"
                         alt="${a.getNomeOggetto}"</td>
                    <td> "${a.getPrezzoOggetto}"</td>
                    <td> "${a.getQuantitaOggetto}"</td>
                    <td> <a href="cliente.html= ${a.getIdOggetto}"> Aggiungi al carrello</a></td>
                </c:forEach>
            </tr>
                 
        </table>
        
    </body>
</html>
