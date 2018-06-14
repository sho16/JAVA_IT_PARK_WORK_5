<#ftl encoding='UTF-8'>
<#include "header_hotel.ftl">
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
        <#--<h2 align="center" style="color:Red">List of hotels</h2>-->
        <div align="center" class="two"><h1>Список гостиниц и номеров</h1> </div>


 <#list hot1 as  buildhotel>
            <tr>
                <th>
                    <h2  style="color:Red">${buildhotel.name}</h2>

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
     <th scope="row">${buildhotel.standart}</th>
     <tr>
     <td>Кондиционер Собственная ванная комната Телевизор с плоским экраном Собственный бассейн Бесплатный Wi-Fi • Душ • Сейф • Телевизор • Телефон • Фен • Халат • Холодильник • Бесплатные туалетные принадлежности • Туалет • Отопление • Тапочки • Услуга «звонок-будильник» • Шкаф/гардероб • Полотенца • Белье • Туалетная бумага Удобства для гостей с ограничениями здоровья Цены указаны за номер включено: Завтрак</td>

     <td>${buildhotel.capacity}</td>
     <td>${buildhotel.hotelprice}</td>
     <td>${buildhotel.choice}</td>
     <td><select><option value="1">Один</option><option value="2">Два</option><option value="3">Три</option><option value="4">Четыре</option></select></td>
     <td><input name="Rezerved" type="radio" />Reserved</td>
 </tr>


 </tbody>

 </#list>


    </table>

</div>



    <style>
    .two {
    background: #E4E5D2;
    padding: 50px 20px;
    text-align: center;
    }
    .two h1 {
    font-family: 'Open Sans', sans-serif;
    position: relative;
    color: #5C2610;
    font-size: 3em;
    font-weight: normal;
    line-height: 1;
    padding: 10px 0;
    margin: 0;
    display: inline-block;
    }
    .two h1:before {
    content: "";
    position: absolute;
    top: 50%;
    left: 50%;
    transform: translate(-50%,-50%);
    width: 80%;
    height: 200%;
    border-radius: 50%/30%;
    border: 6px solid #5C2610;
    border-left-color: transparent;
    border-right-color: transparent;
    }
    @media (max-width: 420px) {
    .two h1 {font-size: 2em;}
    }


    </style>








</body>
</html>