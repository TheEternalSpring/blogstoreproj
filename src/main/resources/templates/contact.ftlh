<#import "/spring.ftl" as spring>

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Contact Us</title>
    <link rel="stylesheet" href="static/stylesheet.css">
</head>
<body>
<div>
    <a href="index">
        <@spring.message "nav.home"/>
    </a>
    <a href="about">
        <@spring.message "nav.about"/>
    </a>
    <a href="contact-us"><@spring.message "nav.contacts"/></a>
    <button>
        <@spring.message "nav.register"/>
    </button>
</div>

</body>
</html>