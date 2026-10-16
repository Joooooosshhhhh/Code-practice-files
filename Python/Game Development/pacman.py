import pygame
import sys

class PacmanGame:
    def __init__(self):
        pygame.init()

        self.width = 600
        self.height = 600
        self.screen = pygame.display.set_mode((self.width, self.height))
        pygame.display.set_caption("PACMAN game 1")

        self.clock = pygame.time.Clock()
        self.running = True

        # grid layout
        self.grid_size = 20
        self.tile_size = self.width // self.grid_size


        # Pacman starting position
        self.pacman_row = 1
        self.pacman_col = 1

        self.pacman_dx = 0
        self.pacman_dy = 0


        # map layout
        self.map_layout = [
            [1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1],
            [1,0,0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,1],
            [1,0,1,1,0,1,1,1,0,1,1,0,1,1,1,0,1,1,0,1],
            [1,0,1,1,0,1,1,1,0,1,1,0,1,1,1,0,1,1,0,1],
            [1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1],
            [1,0,1,1,0,1,0,1,1,1,1,1,1,0,1,0,1,1,0,1],
            [1,0,0,0,0,1,0,0,0,1,1,0,0,0,1,0,0,0,0,1],
            [1,1,1,1,0,1,1,1,0,1,1,0,1,1,1,0,1,1,1,1],
            [1,1,1,1,0,1,0,0,0,0,0,0,0,0,1,0,1,1,1,1],
            [1,1,1,1,0,1,0,1,1,0,0,1,1,0,1,0,1,1,1,1],
            [0,0,0,0,0,0,0,1,0,0,0,0,1,0,0,0,0,0,0,0],
            [1,1,1,1,0,1,0,1,1,1,1,1,1,0,1,0,1,1,1,1],
            [1,1,1,1,0,1,0,0,0,0,0,0,0,0,1,0,1,1,1,1],
            [1,1,1,1,0,1,0,1,1,1,1,1,1,0,1,0,1,1,1,1],
            [1,0,0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,1],
            [1,0,1,1,0,1,1,1,0,1,1,0,1,1,1,0,1,1,0,1],
            [1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1],
            [1,1,0,1,0,1,0,1,1,1,1,1,1,0,1,0,1,0,1,1],
            [1,0,0,0,0,1,0,0,0,1,1,0,0,0,1,0,0,0,0,1],
            [1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1],
        ]




    def run(self):
        while self.running:
            for event in pygame.event.get():
                if event.type == pygame.QUIT:
                    self.running = False

                elif event.type == pygame.KEYDOWN:
                    if event.key == pygame.K_LEFT:
                        self.pacman_dx = -1
                        self.pacman_dy = 0
                    elif event.key == pygame.K_RIGHT:
                        self.pacman_dx = 1
                        self.pacman_dy = 0
                    elif event.key == pygame.K_UP:
                        self.pacman_dx = 0
                        self.pacman_dy = -1
                    elif event.key == pygame.K_DOWN:
                        self.pacman_dx = 0
                        self.pacman_dy = 1
                        

            next_col = self.pacman_col + self.pacman_dx
            next_row = self.pacman_row + self.pacman_dy

            if 0 <= next_col < len(self.map_layout[0]) and 0 <= next_row < len(self.map_layout):
                if self.map_layout[next_row][next_col] == 0:
                    self.pacman_col = next_col
                    self.pacman_row = next_row            

            # background color
            self.screen.fill((0, 0, 0))


            # wall color
            for row_index, row in enumerate(self.map_layout):
                for col_index, tile_value in enumerate(row):
                    if tile_value == 1:
                        x = col_index * self.tile_size
                        y = row_index * self.tile_size
                        pygame.draw.rect(
                            self.screen, 
                            (0, 0, 255), 
                            (x,y, self.tile_size - 1, 
                            self.tile_size - 1)
                        )

            # Pacman
            pacman_x = (self.pacman_col * self.tile_size) + (self.tile_size // 2)
            pacman_y = (self.pacman_row * self.tile_size) + (self.tile_size // 2)

            pygame.draw.circle(
                self.screen,
                (255, 255, 0),
                (pacman_x, pacman_y),
                (self.tile_size // 2) - 4
            )



            pygame.display.flip()

            self.clock.tick(5)

        pygame.quit()
        sys.exit()

if __name__ == "__main__":
    game = PacmanGame()
    game.run()