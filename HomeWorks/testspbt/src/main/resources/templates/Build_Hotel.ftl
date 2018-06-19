<#ftl encoding='UTF-8'>
<#include "header_hotel.ftl">
<!doctype html>
<head>


    <title>Welcome!</title>
    <meta charset="UTF-8">
    <title>Hotels</title>
    <link rel="stylesheet" type="text/css" href="/css/style.css"/>
    <#--<a><button id="btn" class="btn">Сделать заказ</button></a>-->
   <a href="#" id="btn" class="btn">Сделать заказ</a>
    <#--<input type="checkbox" id="payt3"/><label for="payt3"></label>-->



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

    <table id="biglisthotel">
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
     <#--<td><input name=${buildhotel.checkname} type="radio" />${buildhotel.checkname}</td>-->
     <td> <input id="${buildhotel.checkname}" type="checkbox"> Нажмите для выбора </td>
     <#--<input name="rezerved" type="radio"-->

 </tr>


 </tbody>

 </#list>


    </table>

</div>


<style>
a.btn{
background: #81ee2a;
color: #883330;
text-decoration:none;
display:block;
width:180px;
text-align:center;
margin:20px auto;
padding:10px 10px;
transition:all 0.3s;
}
a.btn:hover{
box-shadow:0px -5px 0 #880e83 inset;
}

</style>



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


<#--
<style>
    #btn {display: none;}
    [for="btn"] {
        position: relative;
        display: block;
        width: 100px;
        height: 100px;
        border-radius: 100%;
        background: #ddd linear-gradient(#ccc, #fff);
        box-shadow:
                inset 0 2px 1px rgba(0,0,0,.15),
                0 2px 5px rgba(200,200,200,.1);
        cursor: pointer;
    }
    [for="btn"]:after {
        content: "";
        position: absolute;
        left: 40%; top: 40%;
        width: 20%;
        height: 20%;
        border-radius: 100%;
        background: #969696 radial-gradient(40% 35%, #ccc, #969696 60%);
        box-shadow:
                inset 0 2px 4px 1px rgba(0,0,0,.3),
                0 1px 0 rgba(255,255,255,1),
                inset 0 1px 0 white;
    }
    [for="btn"]:before {
        content: "";
        position: absolute;
        top: 8%; right: 8%; bottom: 8%; left: 8%;
        border-radius: 100%;
        background: #eaeaea;
        box-shadow:
                0 3px 5px rgba(0,0,0,.25),
                inset 0 1px 0 rgba(255,255,255,.3),
                inset 0 -5px 5px rgba(100,100,100,.1),
                inset 0 5px 5px rgba(255,255,255,.3);
    }
    #btn:checked ~ [for="btn"]:before {
        background: #e5e5e5 linear-gradient(#dedede, #fdfdfd);
    }
    #btn:checked ~ [for="btn"]:after {
        background: #25d025 radial-gradient(40% 35%, #5aef5a, #25d025 60%);
        box-shadow:
                inset 0 3px 5px 1px rgba(0,0,0,.1),
                0 1px 0 rgba(255,255,255,.4),
                0 0 10px 2px rgba(0, 210, 0, .5);
    }
</style>
-->




<script src="//yandex.st/jquery/2.1.1/jquery.min.js"></script>
<#--<script>

    $('#btn').click(function(){
        if ($('#check1').is(':checked')){
        alert('Включен');
   } else {
        alert('Выключен');
    }
    });


</script>-->

 <#-- <script>
       var tableElem = document.getElementById('biglisthotel');
       var elements = tableElem.getElementsByTagName('input');

       for (var i = 0; i < elements.length; i++) {
               var input = elements[i];
              /* alert(input.id + ': ' + input.checked);*/
               if ($('input.checkbox').is(":checked")) {
                   alert(input.id + 'Press ');

               }
           }

</script>-->

<script>
    var tableElem = document.getElementById('biglisthotel');
    var elements = tableElem.getElementsByTagName('input');

        for (var i = 0; i < elements.length; i++) {
            var input = elements[i];
            /*alert(input.id + ': ' + input.checked);*/

            document.getElementById(input.id).onclick = function () {
                if (this.checked) {
// если checked ...
                    alert(this.value);
                } else {
// если не checked ...
                }
            }
        }


;

</script>

<#--
<script>
document.getElementById('check2').onclick = function() {
    if ( this.checked ) {
// если checked ...
        alert( this.value );
    } else {
// если не checked ...
    }
};
</script>
-->



</body>
</html>