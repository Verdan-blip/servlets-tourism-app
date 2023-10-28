<#import "navbars.ftl" as navbars>

<!DOCTYPE HTML>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Profile</title>
    <script src="https://code.jquery.com/jquery-latest.min.js"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
          rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
          crossorigin="anonymous">
</head>
<body>
    <@navbars.navbars user></@navbars.navbars>

    <div class="input-group">
        <input id="search-input" type="search" class="form-control rounded" placeholder="Введите название города" aria-label="Search" aria-describedby="search-addon" />
        <button id="search-button" type="button" class="btn btn-outline-primary">Найти отели</button>
    </div>

    <div class="row" style="margin-bottom: 8px;">
        <div class="col-md-auto">
            <label for="filter-by-price" style="margin: 8px 8px;">Фильтровать по</label>
            <select id="filter-by-price" class="form-select">
                <option disabled selected>Выберите</option>
                <option value="by-ascending">По возрастанию</option>
                <option value="by-descending">По убыванию</option>
                <option value="by-rating">По рейтингу</option>
            </select>
        </div>
    </div>

    <div id="search-result"></div>

    <script type="text/javascript" src="../js/get_hotels.js"></script>

</body>
</html>