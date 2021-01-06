<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<body>
<center>
<form method="post" action="/result">
    <div class="row">
        <div class="six columns">
            <label for="name">Your Name</label>
            <input class="u-full-width" type="text" name="name" id="name">
        </div>
    </div><br>
    <div class="row">
        <div class="six columns">
            <label for="location">Location</label>
            <select class="u-full-width" name="location" id="location">
                <option value="Seattle">Seattle</option>
                <option value="San Jose">San Jose</option>
                <option value="Dallas">Dallas</option>
                <option value="Chicago">Chicago</option>

            </select>
        </div>
    </div><br>
    <div class="row">
        <div class="six columns">
            <label for="language">Favorite Language</label>
            <select class="u-full-width" name="language" id="language">
                <option value="Python">Python</option>
                <option value="Ruby">Ruby</option>
                <option value="Swift">Swift</option>
                <option value="Java">Java</option>

            </select>
        </div>
    </div><br>
    <div class="row">
        <div class="six columns">
        <label for="exampleMessage">Comment</label>
        <textarea class="u-full-width" placeholder="your comment" name="comment" id="exampleMessage"></textarea>
        </div>
    </div>
    <div class="row">
        <div class="six columns"><br>
        <button>Submit</button>
        </div>
    </div>
</form>
</center>
</body>
</html>