/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$(document).ready(function ()
{
   $("#ricerca").keyup(function()
    {  
        // Preleva il valore
        var text = $("#ricerca").val();
       
        $.ajax(
        {
            url: "filter",
            data:{
              cmd: "search",
              text: text
            },
            dataType: 'json',
            success : function(data, state){
                aggiornaListaAlunni(data);
            },
            error : function(data, state){
            }
        });
        
       // Funzione che viene richiamata in caso di successo
        function aggiornaListaOggetti(listaOggetti)
        {
            // Cancella la lista
            $("#listaOggetti").empty();
            // Per ogni alunno trovato dal database
            for(var oggetto in listaOggetti)
            {
                // Crea un nuovo tag li
                var newli = document.createElement("li");
                newli.setAttribute("name", "oggetto");
                // testo
                var text = document.createTextNode(listaOggetti[oggetto].nomeOgg + 
                        " " + listaOggetti[oggetto].urlOgg + 
                        " " + listaOggetti[oggetto].quantitaOgg + 
                        " " + listaOggetti[oggetto].prezzoOgg + 
                        " " + listaOggetti[oggetto].idOggetto + " ");
                newli.appendChild(text);
                // Crea link
                var link = document.createElement("a");
                link.setAttribute("href", "Filtra?oggettoId="+listaOggetti[oggetto].id);
                var fieldTxt = document.createTextNode("Aggiungi oggetto");
                link.appendChild(fieldTxt);
                newli.appendChild(link);
                
                // Aggiunge il tag li al tag ul
                $("#listaOggetti").append(newli);
            }
        }
    }); 
});