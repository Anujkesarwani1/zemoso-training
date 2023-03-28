import { ComponentMeta, ComponentStory } from '@storybook/react';
import Typography from '.';

export default {
    title: 'Atoms/Typography',
    component: Typography,
    argTypes: {
        variant: {
            control: 'select',
            options: ['h1', 'h2', 'h3', 'h4', 'h5', 'h6', 'p', 'body1', 'body2'],
        },
    },
} as ComponentMeta<typeof Typography>;

const Template: ComponentStory<typeof Typography> = (args) => (
    <Typography {...args}></Typography>
);

export const typography = Template.bind({});

typography.args = {
    variant: 'h1',
    children: 'Typography',
};