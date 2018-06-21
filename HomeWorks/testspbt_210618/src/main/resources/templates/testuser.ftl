<#ftl encoding='UTF-8'>
<#include "tourists.ftl">
<!doctype html>
<head>
    <title>Welcome!</title>
    <meta charset="UTF-8">
    <title>Users</title>
    <link rel="stylesheet" type="text/css" href="/css/style.css"/>
</head>




<body>


<div class="names">


    <table>
        <h2 align="center" style="color:Red">Fame Residence</h2>
        <#--<tr>
            <th>

            </th>
        </tr>-->
        <#--<#list names as name>
            <tr>
                <td>
                    ${name}
                </td>
            </tr>
        </#list>&ndash;&gt;-->
    </table>
</div>
<div class="form-style-6">
    <form action="/ParametersServlet" method="get">
        <input type="text" name="user" placeholder="User" />
        <input type="text" name="name" placeholder="Name" />

        <input type="text" name="surname" placeholder="Surname" />
        <input type="submit" value="Сохранить"/>
    </form>
</div>
</body>
</html>