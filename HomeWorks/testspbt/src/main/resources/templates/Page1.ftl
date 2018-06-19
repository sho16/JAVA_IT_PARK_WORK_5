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

<div class="text-center">
    <p><label class="checkbox"><input id="checkbox" type="checkbox">checkbox</label></p>
    <p><button id="btn" class="btn btn-sm btn-default">Проверить checkbox</button></p>
</div>

<style>
    .checkbox {
        display: inline-block;
        margin-bottom: 0;
        line-height: 21px;
    }
</style>

<script src="//yandex.st/jquery/2.1.1/jquery.min.js"></script>
<script>
    $('#btn').click(function(){
        if ($('#checkbox').is(':checked')){
            alert('Включен');
        } else {
            alert('Выключен');
        }
    });
</script>

<title>nth-child</title>

<style>
    table {
        width: 100%; /* Ширина таблицы */
        border-spacing: 0; /* Расстояние между ячейками */
    }
    tr:nth-child(2n) {
        background: #f0f0f0; /* Цвет фона */
    }
    tr:nth-child(1) {
        background: #666; /* Цвет фона */
        color: #fff; /* Цвет текста */
    }
</style>
</head>
<#--<body>-->
<table border="1" id="age-table">
    <tr>
        <td>&nbsp;</td><td>2134</td><td>2135</td>
        <td>2136</td><td>2137</td><td>2138</td>
    </tr>
  <#-- <tr>
        <td>Нефть</td><td>16</td><td>34</td>
        <td>62</td><td>74</td><td>57</td>
    </tr>
    <tr>
        <td>Золото</td><td>4</td><td>69</td>
        <td>72</td><td>56</td><td>47</td>

    </tr>
    <tr>
        <td>Дерево</td><td>7</td><td>73</td>
        <td>79</td><td>34</td><td>86</td>
    </tr>
    <tr>
        <td>Камни</td><td>23</td><td>34</td>
        <td>88</td><td>53</td><td>103</td>
    </tr>-->
</table>



<#--<table id="age-table">
    <tr>
        <td>Ваш возраст:</td>

        <td>
            <label>
                <input type="radio" name="age" value="young" checked> младше 18
            </label>
            <label>
                <input type="radio" name="age" value="mature"> от 18 до 50
            </label>
            <label>
                <input type="radio" name="age" value="senior"> старше 60
            </label>
        </td>
    </tr>

</table>-->

<script>
    var tableElem = document.getElementById('age-table');
    var elements = tableElem.getElementsByTagName('td');
   /* var parent = tableElem.closest('.table')
    alert(parent.id);
*/
   /*for (var i = 0; i < elements.length; i++) {
        var tab = elements[i];
        alert( tab.innerHTML );
    }*/
</script>


</body>
</html>