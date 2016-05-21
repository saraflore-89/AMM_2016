<%-- 
    Document   : login
    Created on : 16-mag-2016, 14.33.07
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
        <title>Login</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!-- Aggiungo keywords, breve descrizione e autore -->
        <meta name="keywords" content="login, shop, online, sell, makeup">
        <meta name="description" content="Login">
        <meta name="author" content="Sara Flore">
        <link href="style.css" rel="stylesheet" type="text/css" media="screen" />
    </head>
    <body>
        
        <!--Inserisco la sezione di navigazione -->
        <nav>
            <a href="descrizione.html">Home</a>
            <a href="cliente.html">Cliente</a>
            <a href="venditore.html">Area Venditore</a>
        </nav>
        
        <h1>Effettua l'accesso al sito</h1>
        <c:if test="${Errore != null}">
            <p>Login errato!</p>
        </c:if>
        <!--Inserisco il form di login -->
        <form action="login.html" method="post">
            <div>
            <label for="user">Username</label>
            <input type="text" name="user"
            id="user" value="nome utente" />
            </div>
            <div>
            <label for="pswd">Password</label>
            <input type="password" name="pswd"
            id="pswd" value="oscurato" />
            </div>
             <!--Pulsanti per inviare e resettare -->
            <div>
                <input name="Submit"  type="submit" value="Invia"/>
                <input type="reset" value="Reimposta"/>
            </div>
        </form>
    </body>
</html>
