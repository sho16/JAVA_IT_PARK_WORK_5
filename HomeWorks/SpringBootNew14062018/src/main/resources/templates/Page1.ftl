<#ftl encoding='UTF-8'>
<#include "header.ftl">
<!doctype html>
<head>
    <title>Welcome!</title>
    <meta charset="UTF-8">
    <title>Users</title>
    <link rel="stylesheet" type="text/css" href="/css/style.css"/>
</head>

<body>

<div class="name">


    <table>
        <h2 align="center" style="color:Red">List of customers</h2>



    <#list names as name >


        <#--<tr>
            <td>-->
                <h2 align="center" style="color:Yellow">  ${name}  </h2>

        <#--  </td>
        </tr>-->

    </#list>


    </table>

</div>




</body>
</html>