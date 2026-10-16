from imagetotext import ImageToText  # Assumes you have such a module
from PIL import Image
import matplotlib.pyplot as plt

# Load the image and retain its colors
image_path = "your_image.jpg"
image = Image.open(image_path).convert("RGB")  # Ensure RGB mode to retain colors

# Display the image to confirm colors are preserved
plt.imshow(image)
plt.axis('off')
plt.title("Original Image with Colors")
plt.show()

# Initialize the ImageToText processor
ocr = ImageToText()

# Extract text from the image
extracted_text = ocr.extract_text(image_path)

print("Extracted Text:")
print(extracted_text)
