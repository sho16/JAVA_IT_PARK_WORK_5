<#ftl encoding='UTF-8'>
<#include "header.ftl">
<!doctype html>
<head>
    <title>Welcome!</title>
    <meta charset="UTF-8">
    <title>Users</title>
    <link rel="stylesheet" type="text/css" href="/css/style.css"/>
</head>

<style type="text/css">
    table {
        margin: auto;
        align: center; // Для выравнивания содержимого таблицы по центру по горизонтали
    vertical-align: center; // Для выравнивания содержимого таблицы по центру по вертикали
    }
</style>

<body>

<div class="name">


    <table>
        <h2 align="center" style="color:Red">List of customers</h2>



 <#list tabusers as  tabuser>
            <tr>
                <td>
                    <h2 align="center" style="color:Red"> ${tabuser.name}</h2>
                </td>
                <td>
                    <h2 align="center" style="color:Green">${tabuser.surname}</h2>
                </td>
     <#list tabuser.hotels as hotel_name >
              <td>
                   <h2 align="center" style="color:Red"> ${hotel_name.name}</h2>
              </td>
     </#list>

            </tr>
 </#list>


    </table>








</div>




</body>
</html>