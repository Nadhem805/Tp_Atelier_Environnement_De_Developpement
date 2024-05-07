<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.util.List" %>
<%@ page import="mod.Note" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Notes</title>
</head>
<body>
    <h1>Notes de l'étudiant</h1>
    
    <%-- Récupérer les données de la servlet --%>
    <c:forEach var="note" items="${noteForm.notes}">
        <p>Matière : ${note.matiere}, Note : ${note.note}</p>
    </c:forEach>
    
    <%-- Calculer la moyenne des notes --%>
    <%
        double total = 0;
        int count = 0;
        List<Note> notesList = (List<Note>) request.getAttribute("noteForm");
        for (Note note : notesList) {
            total += note.getNote();
            count++;
        }
        double moyenne = count > 0 ? total / count : 0;
    %>
    
    <%-- Afficher la moyenne --%>
    <p>MOYENNE : <%= moyenne %></p>
</body>
</html>
