// Hamburger toggle functionality
const hamburgerIcon = document.getElementById('hamburger-icon');
const dropdownMenu = document.getElementById('dropdown-menu');
const x = document.getElementById('x');

hamburgerIcon.addEventListener('click', () => {
    dropdownMenu.classList.toggle('active');
    x.classList.toggle('visible');
    hamburgerIcon.classList.toggle('visible');
});

x.addEventListener('click', () => {
    dropdownMenu.classList.remove('active');
    x.classList.remove('visible');
    hamburgerIcon.classList.toggle('visible');
});

// (Newline added here)
