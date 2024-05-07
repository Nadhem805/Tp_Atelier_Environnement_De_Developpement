<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!DOCTYPE html>
    <html>
    
    <head>
    <meta charset="UTF-8">
    <title>Informations machine</title>
    </head>
    
    <body>
    <p>Nous sommes le : <%= out.println(new Date()); %></p>
    
    <p>Votre adresse IP est : <%= out.println(InetAddress.getLocalHost().getHostAddress()); %></p>
    
    <p>Le nom du serveur sur lequel vous êtes connecté : <%= out.println(request.getServerName()); %></p>
    <p>Le nom de votre machine: <%= out.println(System.getProperty("user.name")); %></p>
    
    </body>
    
    </html>