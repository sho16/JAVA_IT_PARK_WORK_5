<#ftl encoding='UTF-8'>
<#--<#include "header.ftl">-->
<!doctype html>
<head>
    <title>Welcome!</title>
    <meta charset="UTF-8">
    <title>Hotels</title>
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
        <h2 align="center" style="color:Red">List of hotels</h2>



 <#list hot as  tabhotel>
            <tr>
                <th>
                    <h2 align="center" style="color:Red">${tabhotel}</h2> <p><input name="111" type="radio" value="2"></p>

                </th>



            </tr>



        <tr>
            <th scope="row">Тип номера</th>
            <th scope="col">Вмещает</th>
            <th scope="col">Сегодняшняя цена</th>
            <th scope="col">На ваш выбор</th>
            <th scope="col">Выберите номер</th>
            <th scope="col">Бронирование</th>
        </tr>

 <tbody>
 <tr>
     <th scope="row">Стандарт</th>
     <td>2 перс</td>
     <td>14 750&nbsp;руб.</td>
     <td>
         <ul>
             <li><strong>Хороший</strong>завтрак включен</li>
             <li>БЕСПЛАТНАЯ отмена бронирования до 23:59 19 июня 2018</li>
         </ul>

         <p>Осталось 7 номеров!</p>
     </td>
     <td>Количество номеров</td>
     <td>&nbsp;</td>
 </tr>
 <tr>
     <th scope="row">&nbsp;</th>
     <td>&nbsp;</td>
     <td>&nbsp;</td>
     <td>&nbsp;</td>
     <td>&nbsp;</td>
     <td>&nbsp;</td>
 </tr>
 </tbody>





     </#list>


    </table>



<#--
    <table border="1" cellpadding="1" cellspacing="1" style="width:500px">
        <caption>Гостиница</caption>
        <thead>
        <tr>
            <th scope="row">Тип номера</th>
            <th scope="col">Вмещает</th>
            <th scope="col">Сегодняшняя цена</th>
            <th scope="col">На ваш выбор</th>
            <th scope="col">Выберите номер</th>
            <th scope="col">Бронирование</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <th scope="row">&nbsp;</th>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
        </tr>
        <tr>
            <th scope="row">&nbsp;</th>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
        </tr>
        </tbody>
    </table>

    <p>&nbsp;</p>-->










</div>






</body>
</html>