const display = document.getElementById('display');

        function appendToDisplay(value) {
            if (display.textContent === '0' && value != "-") {
                display.textContent = value;
            } else {
                display.textContent += value;
            }
        }

        function clearDisplay() {
            display.textContent = '0';
        }

        function backspace() {
            let string = display.textContent;
            if (string == "Error") {
                return;
            }
            if (string.length > 1) {
                display.textContent = string.substring(0, string.length - 1);
                return;
            }
            display.textContent = 0;
        }

        function calculateResult() {
            let string = display.textContent;
            if (string === "Error") {
                return;
            }
            try {
                display.textContent = eval(string);
            } catch {
                display.textContent = 'Error';
            }
        }

        function root() {
            let string = display.textContent;
            if (display.textContent === "Error") {
                return;
            }
            if (!isNaN(string)) {
                display.textContent = Math.sqrt(display.textContent);
                return;
            }
            calculateResult();
            if (display.textContent === "Error") {
                return;
            }
            display.textContent = Math.sqrt(display.textContent);
        }