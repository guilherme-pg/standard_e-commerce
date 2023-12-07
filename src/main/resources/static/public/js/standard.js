
var logout_button = document.getElementById('logoutButton')

if (logout_button != null) {
    logout_button.addEventListener('click', function() {

        // Remove the access token from local storage
        localStorage.removeItem('access_token');

        // Redirect to the logout URL
        // window.location.href = '/public/login';  // Replace with your logout URL
    });
}
